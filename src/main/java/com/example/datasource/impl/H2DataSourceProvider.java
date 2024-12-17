package com.example.datasource.impl;

import com.example.datasource.DataSourceProvider;
import com.example.datasource.DataSourceType;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class H2DataSourceProvider implements DataSourceProvider {
    @Override
    public void getDataSource() {
        log.info("H2 datasource provider is starting...");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("H2 datasource provider is stopping...");
    }

    @Override
    public boolean getDataSourceType(DataSourceType dataSourceType) {
        return DataSourceType.H2.equals(dataSourceType);
    }
}
