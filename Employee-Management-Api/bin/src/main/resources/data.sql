

INSERT INTO employees (id, email, first_name, last_name) 
VALUES (1, 'nishant@gmail.com','nishant','saxena'),
	   (2, 'sneha@gmail.com','sneha','sharma'),
       (3, 'raj@gmail.com','raj','prakash'),
       (4, 'rahul@gmail.com','rahul','sharma'),
       (5, 'apoorva@gmail.com','apoorva','sathya'),
       (6, 'tanya@gmail.com','tanya','kapoor');
       
 
       -- insert data into role table
INSERT INTO role (id, name)
VALUES (1, 'ADMIN'),
	   (2, 'USER');

	   -- insert data into user table
	   
INSERT INTO user (id, password, username)
VALUES (1, '$2a$08$Y09I.9niV5KM8Y/NhZ.pb.QD03JityCaq/AIe5R01qbnvKrsXpUMW', 'admin' ),
	   (2, '$2a$08$3MUTJa2KaWEjsj8Ks6aA/uzbCig4crD5MwLSMY4ezdwERKxRWPxKK', 'user');
	   
	   --
	   --password for admin --> admin
	   --password for user  -->user
 	   --
 	   
	-- insert data into users_roles table   
INSERT INTO users_roles(user_id, role_id)
VALUES (1, 1),
	   (2, 2);  
