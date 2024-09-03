
# Email Report Generator

This is an application designed to automate the retrieval and distribution of financial reports via email. The project integrates with Oracle Cloud Infrastructure (OCI) to manage and deliver reports efficiently.

## Project Overview

### Features

1. **Report Retrieval:**
   - Connects to Oracle Cloud Infrastructure (OCI) Object Storage to fetch the latest financial report file. 
   - The report file (e.g., `report.html`) is stored in a specified bucket and namespace within OCI.

2. **Email Distribution:**
   - Sends the retrieved report as an email to a list of predefined recipients.
   - Uses JavaMailSender for sending emails, allowing for rich-text (HTML) content in the email body.

3. **Scheduled Task:**
   - Automatically performs the report retrieval and email distribution tasks on a weekly basis.
   - Utilizes Spring's `@Scheduled` annotation to manage the periodic execution of these tasks.

### How It Works

1. **Configuration:**
   - The application is configured to use OCI Object Storage for report retrieval. You need to provide an OCI configuration file (`~/.oci/config`) and specify the appropriate profile.
   - Email settings are configured via `application.properties` to ensure that emails are sent correctly.

2. **Service Components:**
   - **OSClientConfiguration:** Sets up the connection to OCI Object Storage using the configuration file and profile.
   - **FileOSService:** Handles the retrieval of the report file from OCI Object Storage.
   - **EmailService:** Manages the composition and sending of emails containing the report.
   - **ScheduleReportService:** Orchestrates the retrieval of the report and sending of emails on a scheduled basis.

3. **Dependencies:**
   - The project relies on several dependencies, including Spring Boot for application management, Spring Mail for email operations, and OCI Java SDK for interacting with Oracle Cloud services.

## Purpose

This application is particularly useful for businesses that need to distribute periodic financial or other reports to stakeholders without manual intervention. It automates the process of fetching reports from cloud storage and emailing them, saving time and ensuring consistent delivery.

