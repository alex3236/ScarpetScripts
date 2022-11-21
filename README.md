# ScarpetScripts
一些~~有用的~~ Scarpet 脚本

## 环境

仅在 `Minecraft 1.19.2`, `Carpet Mod v1.4.84` 下测试通过。Scarpet 文档中未给出 API 兼容性相关说明，因此请自行尝试。

应当按 Carpet Mod 要求将脚本放置在 `<world folder>/scripts` 文件夹下。

在游戏中可用 `/script load <name>` 热加载/热重载，`/script unload <name>` 卸载，`/script remove <name>` 扔到回收站。

## Scbd

![scbd](https://s2.loli.net/2022/11/21/1HScua4GfBJIrg2.png)

记分板实现和订阅。除破基岩榜（独立实现）外，其余可自动同步启用脚本前的历史数据。

卸载后需手动删除记分板（TODO：卸载时记分板自清除）

使用 `/scbd` 以显示可订阅记分板菜单，点击即可订阅。

## Sys

![sys](https://s2.loli.net/2022/11/21/GeOWAPXzv67wCB9.png)

`/sys` 显示系统信息。
