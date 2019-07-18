package com.liferay.test.upgrade.v1_0_1;

import com.liferay.portal.kernel.upgrade.UpgradeProcess;
import com.liferay.test.upgrade.MyCustomModuleUpgrade;
import com.liferay.portal.kernel.dao.db.DBType;
import com.liferay.portal.kernel.dao.db.DBTypeToSQLMap;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class UpgradeFoo extends UpgradeProcess {

	@Override
	protected void doUpgrade() throws Exception {
		Log _log = LogFactoryUtil.getLog(UpgradeFoo.class.getName());
		_log.error(" ** starting UpgradeFoo - doUpgrade method **");
		String sql = "ALTER TABLE FOO_Foo modify COLUMN field5 VARCHAR(255)";
		runSQL(sql);
		
//		DBTypeToSQLMap template = new DBTypeToSQLMap(null);
//		DBType dbType = DBType.MYSQL;
//		String sql = "ALTER TABLE FOO_Foo modify COLUMN field5 VARCHAR(255)";
//		template.add(dbType, sql );
//		runSQL(template);
		
		_log.error(" ** stopping UpgradeFoo - doUpgrade method **");
	}
}