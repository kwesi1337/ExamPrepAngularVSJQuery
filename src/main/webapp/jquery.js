$(document).ready(function(){
    $.ajax({url: "api/factories/members", success: function (result){
            $.each(result, function(i, item){
                var friends = "";
                $.each(item.friends, function (k, thing){
                    friends = friends +thing.id +", ";
                });
                
                if(friends.length !== 0){
                    friends = friends.substring(0, friends.length-2);
                }
                
                var $tr = $('<tr>').append(
                        $('<td>').text(item.id),
                    $('<td>').text(item.name),
                    $('<td>').text(item.age),
                    $('<td>').text(item.eyeColor),
                    $('<td>').text(item.email),
                    $('<td>').text(friends));
                    
                    $('#example').append($tr);
            });
    }
});

});