<?php
$xml = simplexml_load_file("data.xml") or die("Error: Cannot load XML file");
echo "<h1>Gaming Setup Items</h1>";
echo "<table border='1'>";
echo "<tr><th>Name</th><th>Price (USD)</th><th>Brand</th></tr>";
foreach ($xml->item as $item) {
    echo "<tr>";
    echo "<td>" . $item->name . "</td>";
    echo "<td>" . $item->price . "</td>";
    echo "<td>" . $item->brand . "</td>";
    echo "</tr>";
}

echo "</table>";
?>
