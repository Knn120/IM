package com.github.yuanrw.im.connector.config;

/**
 * Date: 2019-06-14
 * Time: 18:29
 *
 * @author yrw
 */
public class ConnectorConfig {

    private Integer port;
    private String transferHost;
    private Integer transferPort;
    private String restUrl;
    private String logPath;
    private String logLevel;

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getTransferHost() {
        return transferHost;
    }

    public void setTransferHost(String transferHost) {
        this.transferHost = transferHost;
    }

    public String getRestUrl() {
        return restUrl;
    }

    public void setRestUrl(String restUrl) {
        this.restUrl = restUrl;
    }

    public Integer getTransferPort() {
        return transferPort;
    }

    public void setTransferPort(Integer transferPort) {
        this.transferPort = transferPort;
    }

    public String getLogPath() {
        return logPath;
    }

    public void setLogPath(String logPath) {
        this.logPath = logPath;
    }
}