package com.liferay.test.upgrade.v1_1_0;

import com.liferay.portal.kernel.upgrade.UpgradeProcess;
import com.liferay.test.upgrade.v1_1_0.util.FooTable;

public class UpgradeFoo extends UpgradeProcess {

	@Override
	protected void doUpgrade() throws Exception {
		alter(
			FooTable.class,
			new AlterColumnType("field5", "VARCHAR(255) null"));
	}
}