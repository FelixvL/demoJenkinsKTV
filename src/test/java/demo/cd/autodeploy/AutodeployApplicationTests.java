package demo.cd.autodeploy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import demo.cd.autodeploy.domain.TeTesten;
import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AutodeployApplicationTests {

	@Test
	public void contextLoads() {
		TeTesten one = new TeTesten();
		Assert.assertEquals(one.returnOne(), 1);
	}

}
