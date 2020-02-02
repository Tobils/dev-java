delete from peserta_pelatihan;
delete from sesi;

insert into sesi (id, id_materi, mulai, sampai)
values ('aa', 'aa6', '2020-02-02', '2020-02-05');

insert into sesi (id, id_materi, mulai, sampai)
values ('ab', 'aa6', '2020-02-08', '2020-02-12');

insert into sesi (id, id_materi, mulai, sampai)
values ('ac', 'aa7', '2020-02-02', '2020-02-05');

insert into peserta_pelatihan (id_sesi, id_peserta)
values ('aa', 'aa1');

insert into peserta_pelatihan (id_sesi, id_peserta)
values ('aa', 'aa2');

insert into peserta_pelatihan (id_sesi, id_peserta)
values ('aa', 'aa3');

insert into peserta_pelatihan (id_sesi, id_peserta)
values ('ab', 'aa2');

insert into peserta_pelatihan (id_sesi, id_peserta)
values ('ab', 'aa3');

insert into peserta_pelatihan (id_sesi, id_peserta)
values ('ac', 'aa2');