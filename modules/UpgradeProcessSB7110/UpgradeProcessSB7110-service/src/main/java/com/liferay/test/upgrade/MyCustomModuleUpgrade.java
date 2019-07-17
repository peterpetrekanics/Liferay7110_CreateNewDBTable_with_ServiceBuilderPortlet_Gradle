package com.liferay.test.upgrade;

import com.liferay.portal.kernel.upgrade.DummyUpgradeStep;
import com.liferay.portal.upgrade.registry.UpgradeStepRegistrator;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, service = UpgradeStepRegistrator.class)
public class MyCustomModuleUpgrade implements UpgradeStepRegistrator {

	@Override
	public void register(Registry registry) {
		registry.register(
			"com.liferay.test.service", "1.0.0", "1.1.0",
			new com.liferay.test.upgrade.v1_1_0.UpgradeFoo());

//        registry.register(
//            "com.liferay.mycustommodule", "1.0.0", "1.1.0",
//            new com.liferay.test.upgrade.v1_1_0.UpgradeFoo());

//        registry.register(
//            "com.liferay.mycustommodule", "1.1.0", "2.0.0",
//            new com.liferay.test.upgrade.v2_0_0.UpgradeFoo(),
//            new com.liferay.test.upgrade.v2_0_0.UpgradeBar());
    }

}
