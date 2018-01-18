DROP DATABASE IF EXISTS help_me_choose;
CREATE SCHEMA IF NOT EXISTS help_me_choose;
USE help_me_choose;

# DROP TABLE IF EXISTS user;
#
# CREATE TABLE user (
#   user_id INTEGER PRIMARY KEY AUTO_INCREMENT,
#   name     VARCHAR(100),
#   email    VARCHAR(100),
#   password     VARCHAR(200)
# );
#
# DROP TABLE IF EXISTS question;
#
# CREATE TABLE question (
#   question_id INTEGER PRIMARY KEY AUTO_INCREMENT,
#   title VARCHAR(60),
#   details TEXT,
#   owner_id INTEGER,
#   FOREIGN KEY (owner_id) REFERENCES user(user_id)
# );
#
# DROP TABLE IF EXISTS answer;
#
# CREATE TABLE answer (
#   answer_id  INTEGER PRIMARY KEY AUTO_INCREMENT,
#   answer_text TEXT,
#   votes INTEGER,
#   question_id INTEGER,
#   FOREIGN KEY (question_id) REFERENCES question(question_id)
# );