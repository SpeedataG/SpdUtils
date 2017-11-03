* ### 关闭相关→[CloseUtils.java]
```
closeIO       : 关闭IO
closeIOQuietly: 安静关闭IO
```
* ### 文件读写相关工具→[FileIoUtils.java]
```
readFile2BytesByChannel(File file)                                                             :读取文件到字节数组中
readFile2BytesByChannel(String filePath)                                                       :读取文件到字节数组中
readFile2BytesByMap(File file)                                                                 :读取文件到字节数组中
readFile2BytesByMap(String filePath)                                                           :读取文件到字节数组中
readFile2BytesByStream(File file)                                                              :读取文件到字节数组中
readFile2BytesByStream(String filePath)                                                        :读取文件到字节数组中
List<String> readFile2List(File file)                                                          :读取文件到字符串链表中
List<String> readFile2List(File file, int st, int end)                                         :读取文件到字符串链表中
List<String> readFile2List(File file, int st, int end, String charsetName)                     :读取文件到字符串链表中
List<String> readFile2List(File file, String charsetName)                                      :读取文件到字符串链表中
List<String> readFile2List(String filePath)                                                    :读取文件到字符串链表中
List<String> readFile2List(String filePath, int st, int end)                                   :读取文件到字符串链表中
List<String> readFile2List(String filePath, int st, int end, String charsetName)               :读取文件到字符串链表中
List<String> readFile2List(String filePath, String charsetName)                                :读取文件到字符串链表中
String readFile2String(File file)                                                              :读取文件到字符串中
String readFile2String(File file, String charsetName)                                          :读取文件到字符串中
String readFile2String(String filePath)                                                        :读取文件到字符串中
String readFile2String(String filePath, String charsetName)                                    :读取文件到字符串中
setBufferSize(int bufferSize)                                                                  :设置缓冲区尺寸
writeFileFromBytesByChannel(File file, byte[] bytes, boolean isForce)                          :将字节数组写入文件
writeFileFromBytesByChannel(File file, byte[] bytes, boolean append, boolean isForce)          :将字节数组写入文件
writeFileFromBytesByChannel(String filePath, byte[] bytes, boolean isForce)                    :将字节数组写入文件
writeFileFromBytesByChannel(String filePath, byte[] bytes, boolean append, boolean isForce)    :将字节数组写入文件
writeFileFromBytesByMap(File file, byte[] bytes, boolean isForce)                              :将字节数组写入文件
writeFileFromBytesByMap(File file, byte[] bytes, boolean append, boolean isForce)              :将字节数组写入文件
writeFileFromBytesByMap(String filePath, byte[] bytes, boolean isForce)                        :将字节数组写入文件
writeFileFromBytesByMap(String filePath, byte[] bytes, boolean append, boolean isForce)        :将字节数组写入文件
writeFileFromBytesByStream(File file, byte[] bytes)                                            :将字节数组写入文件
writeFileFromBytesByStream(File file, byte[] bytes, boolean append)                            :将字节数组写入文件
writeFileFromBytesByStream(String filePath, byte[] bytes)                                      :将字节数组写入文件
writeFileFromBytesByStream(String filePath, byte[] bytes, boolean append)                      :将字节数组写入文件
writeFileFromIS(File file, InputStream is)                                                     :将输入流写入文件
writeFileFromIS(File file, InputStream is, boolean append)                                     :将输入流写入文件
writeFileFromIS(String filePath, InputStream is)                                               :将输入流写入文件
writeFileFromIS(String filePath, InputStream is, boolean append)                               :将输入流写入文件
writeFileFromString(File file, String content)                                                 :将字符串写入文件
writeFileFromString(File file, String content, boolean append)                                 :将字符串写入文件
writeFileFromString(String filePath, String content)                                           :将字符串写入文件
writeFileFromString(String filePath, String content, boolean append)                           :将字符串写入文件
```
* ### 文件相关→[FileUtils.java]
```
getFileByPath             : 根据文件路径获取文件
isFileExists              : 判断文件是否存在
rename                    : 重命名文件
isDir                     : 判断是否是目录
isFile                    : 判断是否是文件
createOrExistsDir         : 判断目录是否存在，不存在则判断是否创建成功
createOrExistsFile        : 判断文件是否存在，不存在则判断是否创建成功
createFileByDeleteOldFile : 判断文件是否存在，存在则在创建之前删除
copyDir                   : 复制目录
copyFile                  : 复制文件
moveDir                   : 移动目录
moveFile                  : 移动文件
deleteDir                 : 删除目录
deleteFile                : 删除文件
deleteAllInDir            : 删除目录下所有东西
deleteFilesInDir          : 删除目录下所有文件
deleteFilesInDirWithFilter: 删除目录下所有过滤的文件
listFilesInDir            : 获取目录下所有文件
listFilesInDirWithFilter  : 获取目录下所有过滤的文件
getFileLastModified       : 获取文件最后修改的毫秒时间戳
getFileCharsetSimple      : 简单获取文件编码格式
getFileLines              : 获取文件行数
getDirSize                : 获取目录大小
getFileSize               : 获取文件大小
getDirLength              : 获取目录长度
getFileLength             : 获取文件长度
getFileMD5                : 获取文件的MD5校验码
getFileMD5ToString        : 获取文件的MD5校验码
getDirName                : 根据全路径获取最长目录
getFileName               : 根据全路径获取文件名
getFileNameNoExtension    : 根据全路径获取文件名不带拓展名
getFileExtension          : 根据全路径获取文件拓展名
```

* ### 意图相关→[IntentUtils.java]
```
getInstallAppIntent        : 获取安装App（支持6.0）的意图
getUninstallAppIntent      : 获取卸载App的意图
getLaunchAppIntent         : 获取打开App的意图
getAppDetailsSettingsIntent: 获取App具体设置的意图
getShareTextIntent         : 获取分享文本的意图
getShareImageIntent        : 获取分享图片的意图
getComponentIntent         : 获取其他应用组件的意图
getShutdownIntent          : 获取关机的意图
getCaptureIntent           : 获取拍照的意图
```

* ### App相关→[AppUtils.java]
```
isInstallApp         : 判断App是否安装
installApp           : 安装App（支持7.0）
uninstallApp         : 卸载App
launchApp            : 打开App
exitApp              : 关闭应用
getAppPackageName    : 获取App包名
getAppDetailsSettings: 获取App具体设置
getAppName           : 获取App名称
getAppIcon           : 获取App图标
getAppPath           : 获取App路径
getAppVersionName    : 获取App版本号
getAppVersionCode    : 获取App版本码
isSystemApp          : 判断App是否是系统应用
isAppDebug           : 判断App是否是Debug版本
getAppSignature      : 获取App签名
getAppSignatureSHA1  : 获取应用签名的的SHA1值
isAppForeground      : 判断App是否处于前台
getForegroundApp     : 获取前台应用包名
getAppInfo           : 获取App信息
getAppsInfo          : 获取所有已安装App信息
cleanAppData         : 清除App所有数据
```


* ### 清除相关→[CleanUtils.java]
```
cleanInternalCache   : 清除内部缓存
cleanInternalFiles   : 清除内部文件
cleanInternalDbs     : 清除内部数据库
cleanInternalDbByName: 根据名称清除数据库
cleanInternalSP      : 清除内部SP
cleanExternalCache   : 清除外部缓存
cleanCustomCache     : 清除自定义目录下的文件
```
* ### 进程相关→[ProcessUtils.java]
```
getForegroundProcessName  : 获取前台线程包名
killAllBackgroundProcesses: 杀死所有的后台服务进程
killBackgroundProcesses   : 杀死后台服务进程
```

* ### 加密解密相关→[EncryptUtils.java]
```
encryptMD2, encryptMD2ToString                        : MD2加密
encryptMD5, encryptMD5ToString                        : MD5加密
encryptMD5File, encryptMD5File2String                 : MD5加密文件
encryptSHA1, encryptSHA1ToString                      : SHA1加密
encryptSHA224, encryptSHA224ToString                  : SHA224加密
encryptSHA256, encryptSHA256ToString                  : SHA256加密
encryptSHA384, encryptSHA384ToString                  : SHA384加密
encryptSHA512, encryptSHA512ToString                  : SHA512加密
encryptHmacMD5, encryptHmacMD5ToString                : HmacMD5加密
encryptHmacSHA1, encryptHmacSHA1ToString              : HmacSHA1加密
encryptHmacSHA224, encryptHmacSHA224ToString          : HmacSHA224加密
encryptHmacSHA256, encryptHmacSHA256ToString          : HmacSHA256加密
encryptHmacSHA384, encryptHmacSHA384ToString          : HmacSHA384加密
encryptHmacSHA512, encryptHmacSHA512ToString          : HmacSHA512加密
encryptDES, encryptDES2HexString, encryptDES2Base64   : DES加密
decryptDES, decryptHexStringDES, decryptBase64DES     : DES解密
encrypt3DES, encrypt3DES2HexString, encrypt3DES2Base64: 3DES加密
decrypt3DES, decryptHexString3DES, decryptBase64_3DES : 3DES解密
encryptAES, encryptAES2HexString, encryptAES2Base64   : AES加密
decryptAES, decryptHexStringAES, decryptBase64AES     : AES解密
```