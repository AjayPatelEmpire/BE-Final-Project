INSERT INTO `Student`(Roll_no,First_name,Last_Name) VALUES (25,'AJAY','Patel')
INSERT INTO `Student`(Roll_no,First_name,Last_Name) VALUES (26,'smit','Patel')
INSERT INTO `Student`(Roll_no,First_name,Last_Name) VALUES (27,'manan','Patel')
INSERT INTO `Student`(Roll_no,First_name,Last_Name) VALUES (28,'neel','Patel')
INSERT INTO `Student`(Roll_no,First_name,Last_Name) VALUES (29,'sahil','Patel')
INSERT INTO `Student`(Roll_no,First_name,Last_Name) VALUES (22,'parth','Patel')
INSERT INTO `Student`(Roll_no,First_name,Last_Name) VALUES (23,'hitesh','Patel')
SELECT First_name,Last_Name FROM `Student` 
SELECT * FROM `Student` WHERE `First_name`='AJAY' OR `Last_Name`='patel'
SELECT * FROM `Student` WHERE `First_name` LIKE'%t%'
DELETE FROM `Student` WHERE `Roll_no`=23
UPDATE `Student` SET `Last_Name`='Thakkar' WHERE `First_name`='manan'