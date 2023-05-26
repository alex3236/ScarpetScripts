# ScarpetScripts

一些~~有用的~~ [Scarpet](https://github.com/gnembon/scarpet) 脚本

- 在 Minecraft 1.19.3 下开发，理论 1.18.2+ 可用。请自行测试。请使用最新版 Carpet Mod。

## 如何安装

- 如果你的服务器可以正常访问 Github，则可以使用命令快速安装：
```
/carpet scriptsAppStore alex3236/ScarpetScripts/contents
/script download <文件名>
```

![动画](https://github.com/alex3236/ScarpetScripts/assets/45303195/be7436b3-ef3f-484e-ab01-1801c8d83884)

- 否则，请手动安装：
  - 从仓库中下载对应的脚本（`*.sc`）并放置在 `<世界文件夹>/scripts` 目录下；
  - 用 `/script load <name>` 加载脚本。

- `/script [load|unload|remove] <name>` 对应热加载（重载）、卸载、删除脚本。

## Show Me What You Got

![image](https://github.com/alex3236/ScarpetScripts/assets/45303195/52607e67-ba7f-4aac-b72b-b760b1e5c83e)

在聊天中向其他用户展示你的物品。

在聊天框中输入 `[i]`，`[i]` 将被替换成**主手**物品信息。

## Scbd

![scbd](https://s2.loli.net/2022/11/21/1HScua4GfBJIrg2.png)

记分板实现和订阅。除破基岩榜（独立实现）外，自动同步启用脚本前玩家已产生的历史数据。

卸载后需手动删除记分板（TODO：卸载时记分板自清除）

`/scbd` 显示可订阅记分板菜单，点击即可订阅。

## Sys

![sys](https://s2.loli.net/2022/11/21/GeOWAPXzv67wCB9.png)

`/sys` 显示系统信息。~~（等等，为啥不用 Spark）~~
