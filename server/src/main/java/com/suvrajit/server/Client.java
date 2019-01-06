package com.suvrajit.server;

import com.google.common.collect.Lists;
import com.suvrajit.server.Utils.ExampleClient;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;

import java.io.IOException;
import java.util.List;

/**
 * Created by I327917 on 12/27/2018.
 */
public class Client {
    private static String PATH = "/examples/leader";
    private static int CLIENT_QTY = 5;

    public static void main(String[] args) {

    }
}
