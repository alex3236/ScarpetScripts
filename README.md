# ScarpetScripts

一些~~有用的~~ [Scarpet](https://github.com/gnembon/scarpet) 脚本

- 仅在 `Minecraft 1.19.2`, `Carpet Mod v1.4.84` 下测试通过。Scarpet 文档中未给出相关兼容说明，其他版本请自行测试。

- 直接从仓库中下载对应的脚本（`*.sc`）并按 Carpet Mod 要求放置在 `<world folder>/scripts` 文件夹下。

- 在游戏中可用 `/script [load|unload|remove] <name>` 来热加载（重载）、卸载或删除脚本。

## Scbd

![scbd](https://s2.loli.net/2022/11/21/1HScua4GfBJIrg2.png)

记分板实现和订阅。除破基岩榜（独立实现）外，自动同步启用脚本前玩家已产生的历史数据。

卸载后需手动删除记分板（TODO：卸载时记分板自清除）

`/scbd` 显示可订阅记分板菜单，点击即可订阅。

## Sys

![sys](https://s2.loli.net/2022/11/21/GeOWAPXzv67wCB9.png)

`/sys` 显示系统信息。~~（等等，为啥不用 Spark）~~
