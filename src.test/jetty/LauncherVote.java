package jetty;

import org.mortbay.jetty.Connector;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.nio.SelectChannelConnector;
import org.mortbay.jetty.webapp.WebAppContext;
import org.mortbay.thread.QueuedThreadPool;

public class LauncherVote {
    public static void main(String[] args) throws Exception {
        QueuedThreadPool boundedThreadPool = new QueuedThreadPool();
        boundedThreadPool.setMaxThreads(5);

        Server server = new Server();
        server.setThreadPool(boundedThreadPool);
        WebAppContext webContext = new WebAppContext("./WebContent", "/vote");
        webContext.setResourceBase("./WebContent");
        webContext.setDefaultsDescriptor("./webdefault.xml");
        server.addHandler(webContext);

        Connector connector=new SelectChannelConnector();
        connector.setPort(9090);
        connector.setMaxIdleTime(30000);
        connector.setStatsOn(false);
        server.addConnector(connector);

        server.setStopAtShutdown(true);
        server.setSendServerVersion(true);
        server.setSendDateHeader(true);
        server.setGracefulShutdown(1000);

        server.start();
        server.join();
    }
}
