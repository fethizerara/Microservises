INSERT INTO Book (title, author, editor, year, type,availability)
VALUES ('Harry Potter 1', 'J.K Rolling', 'Victor', '2OO2', 'Roman',True);
INSERT INTO Book (title, author, editor, year, type,availability)
VALUES ('Harry Potter 2', 'J.K Rolling', 'Victor', '2OO3', 'Roman',True);
INSERT INTO Book (title, author, editor, year, type,availability)
VALUES ('Harry Potter 3', 'J.K Rolling', 'Victor', '2OO4', 'Roman',True);
INSERT INTO Book (title, author, editor, year, type,availability)
VALUES ('Harry Potter 4', 'J.K Rolling', 'Victor', '2OO5', 'Roman',True);
INSERT INTO Book (title, author, editor, year, type,availability)
VALUES ('Harry Potter 5', 'J.K Rolling', 'Victor', '2OO6', 'Roman',True);

INSERT INTO BORROWING (ISBN, ID_READER, BORROWING_DATE, RETURNING_DATE)
VALUES (3, 3, '2008-11-11','2008-11-21');


INSERT INTO RETURNING (ISBN, ID_READER, RETURNING_DATE)
VALUES (3, 3,'2008-11-21');

