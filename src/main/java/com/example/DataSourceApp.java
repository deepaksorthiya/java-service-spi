package com.example;

import com.example.datasource.DataSourceProvider;
import com.example.datasource.DataSourceType;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

@Slf4j
public class DataSourceApp {
    private static final List<DataSourceProvider> dataSourceProviders = new ArrayList<>();

    static {
        final ServiceLoader<DataSourceProvider> serviceLoaderDataSources = ServiceLoader.load(DataSourceProvider.class);
        for (DataSourceProvider serviceLoaderDataSource : serviceLoaderDataSources) {
            dataSourceProviders.add(serviceLoaderDataSource);
        }
    }

    public static void main(String[] args) {
        new DataSourceApp().loadDataSources();
    }

    public void loadDataSources() {
        for (DataSourceProvider dataSourceProvider : dataSourceProviders) {
            for (DataSourceType dataSourceType : DataSourceType.values()) {
                if (dataSourceProvider.getDataSourceType(dataSourceType)) {
                    log.info("DataSource provider {} found and DataSourceType is {}", dataSourceProvider, dataSourceType);
                    dataSourceProvider.getDataSource();
                }
            }
        }
    }
}
