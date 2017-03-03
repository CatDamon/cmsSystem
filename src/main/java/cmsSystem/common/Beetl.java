package cmsSystem.common;

import java.io.IOException;

import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.ClasspathResourceLoader;

public class Beetl {
	public void loadBeetl () throws Exception {
		//文件模板加载器，模板文件位于Classpath里
		ClasspathResourceLoader resourceLoader = new ClasspathResourceLoader("/src/main/webapp/WEB-INF/template/","utf-8");
		//配置数据加载
		Configuration cfg = Configuration.defaultConfiguration();
		//
		GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
		Template t = gt.getTemplate("/index.html");
		String str = t.render();
		System.out.println(str);
	}
	public static void main(String[] args) {
		Beetl bt = new Beetl();
		try {
			bt.loadBeetl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
