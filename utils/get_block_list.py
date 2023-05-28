'''
Pull all Minecraft block id from Minecraft Wiki and transfer to scarpet code format.
'''
import re

import requests

txt = requests.get(r'https://minecraft.fandom.com/api.php?action=parse&format=json&prop=text%7Cmodules%7Cjsconfigvars&title=Java_Edition_data_values&text=%7B%7B%3AJava%20Edition%20data%20values%2FBlocks%7D%7D').text

blocks = re.findall('<code>(\w+?)<\/code>', txt)

print(f'Got {len(blocks)} blocks:\n')

print('global_blocks = [{}];'.format(
    ','.join([f"'{i}'" for i in blocks])
))