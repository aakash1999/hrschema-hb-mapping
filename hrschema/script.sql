CREATE TABLE `countries` (
  `country_id` int NOT NULL AUTO_INCREMENT,
  `country_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `region_id` int NOT NULL,
  PRIMARY KEY (`country_id`),
  KEY `region_id_fk_idx` (`region_id`),
  CONSTRAINT `region_id_fk` FOREIGN KEY (`region_id`) REFERENCES `regions` (`region_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `departments` (
  `department_id` int NOT NULL AUTO_INCREMENT,
  `department_name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `manager_id` int DEFAULT NULL,
  `location_id` int NOT NULL,
  PRIMARY KEY (`department_id`),
  KEY `manager_id_fk_idx` (`manager_id`),
  KEY `location_id_dept_fk_idx` (`location_id`),
  CONSTRAINT `location_id_dept_fk` FOREIGN KEY (`location_id`) REFERENCES `locations` (`location_id`),
  CONSTRAINT `manaager_id_dept_fk` FOREIGN KEY (`manager_id`) REFERENCES `employees` (`employee_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `employees` (
  `employee_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `last_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `phone_number` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `hire_date` date DEFAULT NULL,
  `job_id` int DEFAULT NULL,
  `salary` double DEFAULT NULL,
  `commision_pct` int DEFAULT NULL,
  `manager_id` int DEFAULT NULL,
  `department_id` int DEFAULT NULL,
  PRIMARY KEY (`employee_id`),
  KEY `manager_id_fk_idx` (`manager_id`),
  KEY `job_id_fk_idx` (`job_id`),
  KEY `department_id_ep_fk_idx` (`department_id`),
  CONSTRAINT `department_id_ep_fk` FOREIGN KEY (`department_id`) REFERENCES `departments` (`department_id`),
  CONSTRAINT `job_id_fk` FOREIGN KEY (`job_id`) REFERENCES `jobs` (`job_id`),
  CONSTRAINT `manager_id_fk` FOREIGN KEY (`manager_id`) REFERENCES `employees` (`employee_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `job_history` (
  `employee_id` int NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `job_id` int NOT NULL,
  `job_history_id` int NOT NULL AUTO_INCREMENT,
  `department_id` int DEFAULT NULL,
  PRIMARY KEY (`job_history_id`),
  KEY `employee_id_jh_fk_idx` (`employee_id`),
  KEY `department_id_jh_fk_idx` (`department_id`),
  KEY `job_id_fk_idx` (`job_id`),
  CONSTRAINT `department_id_jh_fk` FOREIGN KEY (`department_id`) REFERENCES `departments` (`department_id`),
  CONSTRAINT `employee_id_jh_fk` FOREIGN KEY (`employee_id`) REFERENCES `employees` (`employee_id`),
  CONSTRAINT `job_id_jh_fk` FOREIGN KEY (`job_id`) REFERENCES `jobs` (`job_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `jobs` (
  `job_id` int NOT NULL AUTO_INCREMENT,
  `job_title` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `min_salary` double DEFAULT NULL,
  `max_salary` double DEFAULT NULL,
  PRIMARY KEY (`job_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `locations` (
  `location_id` int NOT NULL AUTO_INCREMENT,
  `street_address` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `postal_code` int NOT NULL,
  `city` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `state_province` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `country_id` int NOT NULL,
  PRIMARY KEY (`location_id`),
  KEY `country_id_fk_idx` (`country_id`),
  CONSTRAINT `country_id_fk` FOREIGN KEY (`country_id`) REFERENCES `countries` (`country_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `regions` (
  `region_id` int NOT NULL AUTO_INCREMENT,
  `region_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`region_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
