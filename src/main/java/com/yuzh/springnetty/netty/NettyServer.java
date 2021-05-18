package com.yuzh.springnetty.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.nio.NioEventLoopGroup;

public class NettyServer {
    private NioEventLoopGroup bossGroup = new NioEventLoopGroup();
    private NioEventLoopGroup workGroup = new NioEventLoopGroup();

    public void start(){
        ServerBootstrap bootstrap = new ServerBootstrap();
//        bootstrap.group(bossGroup,workGroup).
    }
}
