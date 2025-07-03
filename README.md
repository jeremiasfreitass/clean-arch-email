# Email Microservice
## Backend Challenge Clean Architecture

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
[![Licence](https://img.shields.io/github/license/Ileriayo/markdown-badges?style=for-the-badge)](./LICENSE)

This project is an API built using **Java, Java Spring, AWS Simple Email Service.**

Email sending project structured with Clean Architecture, promoting the decoupling of business logic from the email delivery mechanism (e.g., Amazon SES), ensuring better flexibility and maintainability.

## Table of Contents

- [Installation](#installation)
- [Configuration](#configuration)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Database](#database)
- [Contributing](#contributing)

## Installation

1. Clone the repository:

```bash
git clone https://github.com/jeremiasfreitass/clean-arch-email.git
```

2. Install dependencies with Maven

3. Update `application.properties` puting your AWS Credentials

```yaml
aws.region=us-east-1
aws.accessKeyId=xxxxxxxxxxxx
aws.secretKey=xxxxxxxxxxxxxx
```
## Usage

1. Start the application with Maven
2. The API will be accessible at http://localhost:8080

## API Endpoints
The API provides the following endpoints:

**SEND EMAIL**
```markdown
POST /api/v1/emails/send - Send a e-mail from your sender to the destination
```

**BODY**
```json
{
  "to": "jeremiasjmf@hotmail.com",
  "subject": "teste",
  "body": "teste"
}
```




