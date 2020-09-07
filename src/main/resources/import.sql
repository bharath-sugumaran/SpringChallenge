insert into FILE_DETAILS (TYPE ,APPLICATION_DESCRIPTION ,FILE_NAME ,FROZEN_STATUS ,CHECKSUM ,FILE_DATE_MODIFIED ,FILE_FINGERPRINT ,FILE_FORMAT ,ROMSIZEKB ,SIZE ,RUN_TIME_SIZE ,SUCCESSOR_PART_NUMBER ,VERSION ,CONSUMER_DOWNLOADABLE ,CONSUMER_VIEWABLE ,DEALER_DOWNLOADABLE ,DIGITALLY_SIGNED ,OTADOWNLOADABLE ,OTAVIEWABLE ,RESIDENT_ON_VEHICLE ,SELLABLE ,SERVICEABLE ,TESTABLE ) values('Application1','Test Application to run certain features in the vehicle','SA-11-TT','True','0xC7C1DA2F',CURRENT_TIMESTAMP,'0x61192B821A9EA47D72DD360175C7A8EE','TAR.GZ','1664508640','1664508640','1664508640','SA-11-TS','1.0','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y');
commit;
insert into PROTOCOL(PROTOCOL_ID ,NETWORK_PROTOCOL ,NETWORK_WIRELESS ,value_type ) values(1,'Yes','OTA','Application1');
insert into PROTOCOL(PROTOCOL_ID ,NETWORK_PROTOCOL ,NETWORK_WIRELESS ,value_type ) values(2,'No','USB','Application1');
commit;
insert into FUNCTIONAL_TYPE_VALUES (FUNCTIONAL_TYPE ,value_type  ) values('Custom Application','Application1');
commit;

insert into FILE_VALUES  (FILE_VALUE,value_type  ) values('CS','Application1');
insert into FILE_VALUES  (FILE_VALUE ,value_type  ) values('DA','Application1');
insert into FILE_VALUES  (FILE_VALUE ,value_type  ) values('DE','Application1');
insert into FILE_VALUES  (FILE_VALUE ,value_type  ) values('FR-FR','Application1');
insert into FILE_VALUES  (FILE_VALUE ,value_type  ) values('PL','Application1');
commit;

insert into COMPATIBLE_ASSEMBLY(ASSYPN ,value_type ) values('SA-12-AAB','Application1',);
insert into COMPATIBLE_ASSEMBLY(ASSYPN ,value_type ) values('SA-12-FAA','Application1');
insert into COMPATIBLE_ASSEMBLY(ASSYPN ,value_type ) values('SA-12-FAB','Application1');
commit;

