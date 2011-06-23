create index IX_9B2F604E on JS_JSEntry (classNameId, classPK);
create unique index IX_298D8D7A on JS_JSEntry (classNameId, classPK, version);
create index IX_13364611 on JS_JSEntry (groupId);
create index IX_D09828DB on JS_JSEntry (uuid_);
create unique index IX_716E122F on JS_JSEntry (uuid_, groupId);