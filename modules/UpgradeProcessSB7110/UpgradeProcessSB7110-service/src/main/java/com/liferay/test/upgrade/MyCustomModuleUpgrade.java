package com.liferay.test.upgrade;

import com.liferay.portal.upgrade.registry.UpgradeStepRegistrator;
import com.liferay.test.upgrade.v1_0_1.UpgradeFoo;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, service = UpgradeStepRegistrator.class)
public class MyCustomModuleUpgrade implements UpgradeStepRegistrator {

	@Override
	public void register(Registry registry) {
		Log _log = LogFactoryUtil.getLog(MyCustomModuleUpgrade.class.getName());
		_log.error(" ** starting MyCustomModuleUpgrade - register method **");
		registry.register(
			"1.0.0", "1.0.1", new UpgradeFoo());

		_log.error(" ** stopping MyCustomModuleUpgrade **");

//        registry.register(
//            "com.liferay.mycustommodule", "1.0.0", "1.1.0",
//            new com.liferay.test.upgrade.v1_1_0.UpgradeFoo());

//        registry.register(
//            "com.liferay.mycustommodule", "1.1.0", "2.0.0",
//            new com.liferay.test.upgrade.v2_0_0.UpgradeFoo(),
//            new com.liferay.test.upgrade.v2_0_0.UpgradeBar());
    }

}
