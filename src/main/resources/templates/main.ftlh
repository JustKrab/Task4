<#import "parts/common.ftlh" as c>
<#include "parts/navbar.ftlh">
    <div class="container mt-5 ml-5">
<@c.page>
    <#list messages as message>
        <div>
            <span style="font-size:15px; color: gray">${message.message}</span>
            <i> </i>
            <span style="font-size:15px; color: gray">${message.authorName}</span>
        </div>
    </#list>
    <div>
        <form method="post">
            <input type="hidden" name="bro" value="bro"/>
            <button style="background-color: blue; font-size: 35px" class="counter__btn" type="submit" id="bro">BRO!</button>
        </form>

        <form method="post">
            <input type="hidden" name="sis" value="sis"/>
            <button style="background-color: blue; font-size: 35px" type="submit" id="sis">SIS!!!</button>
        </form>
    </div>

</@c.page>