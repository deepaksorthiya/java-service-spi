package com.example;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@Slf4j
class DataSourceAppTest {

    private static DataSourceApp dataSourceApp;

    @BeforeAll
    static void beforeAll() {
        log.info("Before All.");
        dataSourceApp = new DataSourceApp();
    }

    @AfterAll
    static void afterAll() {
        log.info("After All.");
        dataSourceApp = null;
    }

    @AfterEach
    void afterEach() {
        log.info("After each.");
    }

    @BeforeEach
    void beforeEach() {
        log.info("Before each.");
    }

    @Test
    void testLoadDataSources() {
        dataSourceApp.loadDataSources();
        assertNotNull(dataSourceApp);
    }

    @Test
    void testMain() {
        dataSourceApp.main(null);
    }
}