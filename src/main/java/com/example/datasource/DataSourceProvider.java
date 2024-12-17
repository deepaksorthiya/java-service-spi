package com.example.datasource;

public interface DataSourceProvider {
    void getDataSource();

    boolean getDataSourceType(DataSourceType dataSourceType);
}