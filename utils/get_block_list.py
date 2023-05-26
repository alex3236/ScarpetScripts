'''
Pull all Minecraft block id from Minecraft Wiki and transfer to scarpet code format.
'''
import re

import requests

txt = requests.get(r'https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/Material.html').text

# print(txt)

blocks = set(re.findall('class="member-name-link">([A-Z_]+?)</a>', txt))

blocks = [i.lower() for i in blocks if not i.startswith('LEGACY')]

print(f'Got {len(blocks)} blocks:\n')

print('global_blocks = [{}];'.format(
    ','.join([f"'{i}'" for i in blocks])
))
