package com.spotlite.ingestmgmtserv.orchestrator;

/**
 * Orchestration Layer for Data Transformation & Coordination
 * 
 * PURPOSE: This file handles data transformation between different layers (DTOs, Entities)
 * and orchestrates calls to multiple services/clients. It coordinates complex workflows
 * that involve multiple external services or microservices. This layer manages the
 * transformation of data models and coordinates the execution flow.
 * 
 * LOCATION: ingestmgmtservService/orchestrator folder
 * 
 * FLOW: Service -> Orchestrator (this file) -> Clients (External & Microservices)
 * 
 * NOTE: This handles both data transformation and orchestration of service calls
 */

