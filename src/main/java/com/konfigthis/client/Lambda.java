package com.konfigthis.client;

import com.konfigthis.client.api.FileSystemApi;
import com.konfigthis.client.api.InstanceApi;
import com.konfigthis.client.api.InstanceTypeApi;
import com.konfigthis.client.api.KeyApi;
import com.konfigthis.client.api.SshKeyApi;

public class Lambda {
    private ApiClient apiClient;
    public final FileSystemApi fileSystem;
    public final InstanceApi instance;
    public final InstanceTypeApi instanceType;
    public final KeyApi key;
    public final SshKeyApi sshKey;

    public Lambda() {
        this(null);
    }

    public Lambda(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.fileSystem = new FileSystemApi(this.apiClient);
        this.instance = new InstanceApi(this.apiClient);
        this.instanceType = new InstanceTypeApi(this.apiClient);
        this.key = new KeyApi(this.apiClient);
        this.sshKey = new SshKeyApi(this.apiClient);
    }

}
