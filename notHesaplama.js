function notHesaplama() {
  var vizeNotu = parseFloat(prompt("Vize notunu girin:"));
  var finalNotu = parseFloat(prompt("Final notunu girin:"));

  var ortalama = vizeNotu * 0.4 + finalNotu * 0.6;
  var harfNotu = hesaplaHarfNotu(ortalama);

  console.log("Ortalama: " + ortalama);
  console.log("Harf Notu: " + harfNotu);
}

function hesaplaHarfNotu(ortalama) {
  if (ortalama >= 90) {
    return "AA";
  } else if (ortalama >= 80) {
    return "BA";
  } else if (ortalama >= 70) {
    return "BB";
  } else if (ortalama >= 60) {
    return "CB";
  } else if (ortalama >= 50) {
    return "CC";
  } else if (ortalama >= 40) {
    return "DC";
  } else if (ortalama >= 30) {
    return "DD";
  } else {
    return "FF";
  }
}

notHesaplama();
