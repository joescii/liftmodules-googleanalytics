/*
	Copyright 2011-2014 Spiral Arm Ltd

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.package bootstrap.liftmodules
*/
package net.liftmodules.googleanalytics

import scala.xml.Unparsed

object Async {

  def headJs(id: String) = <script type="text/javascript">
  	var _gaq = _gaq || [];
  	_gaq.push(['_setAccount', '{Unparsed(id)}']);
  	_gaq.push(['_trackPageview']);
    (function() {{
      var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
      ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
      var s = document.getElementsByTagName('script')[0];
      s.parentNode.insertBefore(ga, s);
    }})();
  	</script>

}