create
DATABASE if not exists patientAppointments;

use
patientAppointments;

set
foreign_key_checks=0;

create table if not exists patient
(
    Email varchar
(
    50
) not null,
    Name varchar
(
    50
) not null,
    Address VARCHAR
(
    100
) not NULL,
    PhoneNumber varchar
(
    12
) not null,
    Password varchar
(
    255
) not null,
    primary key
(
    Email
)
    );

create table if not exists appointment
(
    Email varchar
(
    50
),
    DateTime TIMESTAMP not null,
    comments varchar
(
    100
) default 'NA',
    Primary Key
(
    Email
),
    FOREIGN key
(
    Email
) references Patient
(
    Email
) on update cascade
  on delete cascade
    );

Set
FOREIGN_key_checks=1;

