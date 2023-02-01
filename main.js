
document.getElementById("btn-load").onclick = getPlayers;


function getPlayers() {
    fetch("api/players")
        .then(res => res.json())
        .then(data => {
            const listItems = data.map(p => `<li>${p.id} - ${p.name}</li>`)
            document.getElementById("players-here").innerHTML = listItems.join("\n")
        })
}
