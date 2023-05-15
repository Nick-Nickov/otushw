CREATE TABLE questions (
                           id SERIAL PRIMARY KEY,
                           question_text VARCHAR(255) NOT NULL
);

CREATE TABLE answers (
                         id SERIAL PRIMARY KEY,
                         question_id INTEGER,
                         answer_text VARCHAR(255) NOT NULL,
                         is_correct BOOLEAN DEFAULT FALSE,
                         FOREIGN KEY (question_id) REFERENCES questions(id)
);


INSERT INTO questions (question_text)
VALUES
    ('В каком году был разработан Java?'),
    ('Кто придумал Java?'),
    ('Максимальное значение типа byte в Java?');

INSERT INTO answers (question_id, answer_text, is_correct)
VALUES
    (1, '1979', FALSE),
    (1, '1995', TRUE),
    (1, '2012', FALSE),
    (1, '1998', FALSE),
    (1, '2000', FALSE),
    (2, 'Джеймс Гослинг', TRUE),
    (2, 'Райан Гослинг', FALSE),
    (2, 'Билл Гейтс', FALSE),
    (2, 'Бьёрн Страуструп', FALSE),
    (3, '64', FALSE),
    (3, '127', TRUE),
    (3, '32', FALSE),
    (3, '128', FALSE);


SELECT *
FROM questions;

SELECT *
FROM answers;