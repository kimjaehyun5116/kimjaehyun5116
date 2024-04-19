CREATE TABLE `scott`.`test_table` (
  `userid` VARCHAR(30) DEFAULT NULL,
  `pwd` VARCHAR(30) NOT NULL,
  `name` VARCHAR(30) NOT NULL,
  `phone` VARCHAR(30) NULL,
  `email` VARCHAR(30) NULL,
  PRIMARY KEY (`userid`)
);

	
SELECT * FROM `scott`.`test_table`;

CREATE TABLE test_table_board (
    boardnum INT AUTO_INCREMENT PRIMARY KEY,
    writer VARCHAR(30),
    subject VARCHAR(100),
    content VARCHAR(1000),
    writedate DATETIME DEFAULT NOW(),
    readcount INT DEFAULT 0,
    FOREIGN KEY (writer) REFERENCES test_table(userid) ON DELETE CASCADE ON UPDATE CASCADE
);

SHOW TABLES FROM scott;
SELECT * FROM `scott`.`test_table_board`;

INSERT INTO test_table (userid, pwd, name, phone, email) VALUES
('id1', 'asdf3123', '홍길동', '123-456-7890', 'hong@gamil.com'),
('id2', 'sdfdfd222', '홍길서', '456-789-0123', 'hong@naver.com'),
('id3', 'dpdpdp44', '홍길남', '789-012-3456', 'hong@daum.net');

INSERT INTO test_table_board (writer, subject, content) VALUES
('id1', '백만장자', '돈을 어떻게 버는가'),
('id2', '천만장자', '돈은 이렇게 벌어야지'),
('id3', '억만장자', '돈은 쓸려고 버는거지');