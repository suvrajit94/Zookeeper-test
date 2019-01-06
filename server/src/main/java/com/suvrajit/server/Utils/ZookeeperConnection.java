package com.suvrajit.server.Utils;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * Created by I327917 on 12/27/2018.
 */
public class ZookeeperConnection {
    private ZooKeeper zk;
    final CountDownLatch connectedSignal = new CountDownLatch(1);

    public ZooKeeper connect(String host) throws IOException, InterruptedException {
        zk = new ZooKeeper(host, 10000, new Watcher() {
            public void process(WatchedEvent watchedEvent) {

            }
        });
        return zk;
    }
}
