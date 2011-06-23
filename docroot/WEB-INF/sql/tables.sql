create table JS_JSEntry (
	uuid_ VARCHAR(75) null,
	jsEntryId LONG not null primary key,
	createDate DATE null,
	modifiedDate DATE null,
	js TEXT null,
	classNameId LONG,
	classPK LONG,
	groupId LONG,
	version DOUBLE,
	status INTEGER,
	statusDate DATE null
);