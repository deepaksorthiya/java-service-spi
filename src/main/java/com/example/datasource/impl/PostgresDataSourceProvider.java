package com.example.datasource.impl;

import com.example.datasource.DataSourceProvider;
import com.example.datasource.DataSourceType;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PostgresDataSourceProvider implements DataSourceProvider {
    @Override
    public void getDataSource() {
        log.info("POSTGRESQL datasource provider is starting...");
        log.info("POSTGRESQL datasource provider is stopping...");
    }

    @Override
    public boolean getDataSourceType(DataSourceType dataSourceType) {
        return DataSourceType.POSTGRESQL.equals(dataSourceType);
    }
}
