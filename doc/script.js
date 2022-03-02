const opisFunk = document.getElementById('opis-funkc');
const opisNieFunk = document.getElementById('opis-niefunkc');
const specyfikacja = document.getElementById('spec');
const zmiennePrywatne = document.getElementById('prywatne');

fetch('./opis-funkcjonalny.json')
    .then(d => d.json())
    .then(o => {
        let i = 1;
        for (const el of o) {
            const tr = document.createElement('tr');
            const tdA = document.createElement('td');
            const tdB = document.createElement('td');
            const tdC = document.createElement('td');
            tdA.textContent = i++;
            tdB.textContent = el.name;
            tdC.textContent = el.opis;
            tr.append(tdA, tdB, tdC);
            opisFunk.appendChild(tr);
        }
    })

fetch('./opis-niefunkcjonalny.json')
    .then(d => d.json())
    .then(o => {
        let i = 1;
        for (const el of o) {
            const tr = document.createElement('tr');
            const tdA = document.createElement('td');
            const tdB = document.createElement('td');
            const tdC = document.createElement('td');
            tdA.textContent = i++;
            tdB.textContent = el.name;
            tdC.textContent = el.opis;
            tr.append(tdA, tdB, tdC);
            opisNieFunk.appendChild(tr);
        }
    })

fetch('./spec.json')
    .then(d => d.json())
    .then(o => {
        let i = 1;
        for (const el of o) {
            const tr = document.createElement('tr');
            const tdA = document.createElement('td');
            const tdB = document.createElement('td');
            const tdC = document.createElement('td');
            const tdD = document.createElement('td');
            const tdE = document.createElement('td');
            tdA.textContent = i++;
            tdB.textContent = el.sygnatura;
            tdC.textContent = el.opis;
            tdD.textContent = el.args;
            tdE.textContent = el.ograniczenia;
            tr.append(tdA, tdB, tdC, tdD, tdE);
            specyfikacja.appendChild(tr);
        }
    })

fetch('./prywatne.json')
    .then(d => d.json())
    .then(o => {
        let i = 1;
        for (const el of o) {
            const tr = document.createElement('tr');
            const tdA = document.createElement('td');
            const tdB = document.createElement('td');
            const tdC = document.createElement('td');
            const tdD = document.createElement('td');
            tdA.textContent = i++;
            tdB.textContent = el.name;
            tdC.textContent = el.typ;
            tdD.textContent = el.opis;
            tr.append(tdA, tdB, tdC, tdD);
            zmiennePrywatne.appendChild(tr);
        }
    })
