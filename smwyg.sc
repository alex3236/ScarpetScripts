// Show Me What You Got
// A simple mod which allows displaying your items to other users in chat.
// Take the item with your mainhand and type `[i]` in your chat message.
// [i] will be replaced with the item info.


__on_player_message(player, message) -> (
    if(message ~ '[i]',
        message = replace(message, '\\"', '\\\\"');
        message = replace(message, '\\\\', '\\\\\\\\');
        
        item = query(player(), 'holds', 'mainhand');
        if(!item, return());
        name = item_display_name(item);
        [item, amount, nbts] = item;
        nbts = replace(nbts, '\\"', '\\\\"');

        json_text = [];
        parts = split('\\[i\\]', message);
        first = true;
        if (!parts,
            parts = [''];
        );
        for(parts,
            json_text += str('\"%s\"', _);
            if(first == true,
                json_text += str('{"text":"[","color":"aqua"},{"translate":"entity.minecraft.item","color":"aqua"},{"text":":%s]","color":"aqua","hoverEvent":{"action":"show_item","value":"{id:%s,Count:1,tag:%s}"}}', name, item, nbts);
                first = false;
            );
        );
        run(str('/tellraw @a [%s]', join(',', json_text)));
        return('cancel');
    )
);