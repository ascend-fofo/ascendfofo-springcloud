/*
 *
 *  *  Copyright (c) 2019-2020, 冷冷 (wangiegie@gmail.com).
 *  *  <p>
 *  *  Licensed under the GNU Lesser General Public License 3.0 (the "License");
 *  *  you may not use this file except in compliance with the License.
 *  *  You may obtain a copy of the License at
 *  *  <p>
 *  * https://www.gnu.org/licenses/lgpl.html
 *  *  <p>
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */
package com.dung.cn.conf;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * SwaggerProperties
 *
 * @author: lengleng
 * @date: 2018/7/25  14:00
 */
@Data
@ConfigurationProperties(prefix = "swagger")
public class SwaggerProperties {
	/**
	 * 是否开启swagger
	 */
	private Boolean enabled;
	/**
	 * swagger会解析的包路径
	 **/
	private String basePackage = "";
	/**
	 * swagger会解析的url规则
	 **/
	private List<String> basePath = new ArrayList<>();
	/**
	 * 在basePath基础上需要排除的url规则
	 **/
	private List<String> excludePath = new ArrayList<>();
	/**
	 * 标题
	 **/
	private String title = "Ascendfofo的swagger测试工具";
	/**
	 * 描述
	 **/
	private String description = "使用swagger来测试SpringCloud项目";
	/**
	 * 版本
	 **/
	private String version = "1.0";
	/**
	 * 许可证
	 **/
	private String license = "Powered By AscendCloud";
	/**
	 * 许可证URL
	 **/
	private String licenseUrl = "www.dwlovetzp.com";
	/**
	 * 服务条款URL
	 **/
	private String termsOfServiceUrl = "www.dwlovetzp.com";

	/**
	 * host信息
	 **/
	private String host = "";
	/**
	 * 联系人信息
	 */
	private Contact contact = new Contact();
	/**
	 * 全局统一鉴权配置
	 **/
	private Authorization authorization = new Authorization();

	@Data
	@NoArgsConstructor
	public static class Contact {

		/**
		 * 联系人
		 **/
		private String name = "ascend";
		/**
		 * 联系人url
		 **/
		private String url = "www.dwlovetzp.com";
		/**
		 * 联系人email
		 **/
		private String email = "ascendfofo@163.com";

	}

	@Data
	@NoArgsConstructor
	public static class Authorization {

		/**
		 * 鉴权策略ID，需要和SecurityReferences ID保持一致
		 */
		private String name = "pig4cloud OAuth";

		/**
		 * 需要开启鉴权URL的正则
		 */
		private String authRegex = "^.*$";

		/**
		 * 鉴权作用域列表
		 */
		private List<AuthorizationScope> authorizationScopeList = new ArrayList<>();

		private List<String> tokenUrlList = new ArrayList<>();
	}

	@Data
	@NoArgsConstructor
	public static class AuthorizationScope {

		/**
		 * 作用域名称
		 */
		private String scope = "server";

		/**
		 * 作用域描述
		 */
		private String description = "server all";

	}
}
