package com.liferay.test.upgrade.v1_1_0.util;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

public class FooTable {

	public static final String TABLE_NAME = "FOO_Foo";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR},
		{"fooId", Types.BIGINT},
		{"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT},
		{"userId", Types.BIGINT},
		{"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP},
		{"field1", Types.VARCHAR},
		{"field2", Types.BOOLEAN},
		{"field3", Types.BIGINT},
		{"field4", Types.TIMESTAMP},
		{"field5", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

static {
TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);

TABLE_COLUMNS_MAP.put("fooId", Types.BIGINT);

TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);

TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);

TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);

TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);

TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);

TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);

TABLE_COLUMNS_MAP.put("field1", Types.VARCHAR);

TABLE_COLUMNS_MAP.put("field2", Types.BOOLEAN);

TABLE_COLUMNS_MAP.put("field3", Types.BIGINT);

TABLE_COLUMNS_MAP.put("field4", Types.TIMESTAMP);

TABLE_COLUMNS_MAP.put("field5", Types.VARCHAR);
}
	public static final String TABLE_SQL_CREATE = "create table FOO_Foo (uuid_ VARCHAR(75) null,fooId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,field1 VARCHAR(75) null,field2 BOOLEAN,field3 INTEGER,field4 DATE null,field5 VARCHAR(255) null)";
	public static final String TABLE_SQL_DROP = "drop table FOO_Foo";

	public static final String[] TABLE_SQL_ADD_INDEXES = {
		"create index IX_CFFD06FF on FOO_Foo (field2)",
		"create index IX_B2FCA947 on FOO_Foo (uuid_[$COLUMN_LENGTH:75$], companyId)",
		"create unique index IX_905CD589 on FOO_Foo (uuid_[$COLUMN_LENGTH:75$], groupId)"
	};
}
