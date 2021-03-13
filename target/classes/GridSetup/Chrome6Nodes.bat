echo
cd E:\Doccuments\Selenium\SeleniumCucumber\src\main\resources\BrowserServers
java -Dwebdriver.chrome.driver=E:\Doccuments\Selenium\SeleniumCucumber\src\main\resources\BrowserDrivers\chromedriver.exe -jar selenium-server-standalone-3.141.59.jar -role webdriver -hub http://172.19.176.1:4445/grid/register/ -browser browserName="chrome",maxInstances=6,platform="WINDOWS" -maxSession 50 -port 5557
pause