#!/bin/bash

README="README.md"

easy_count=$(grep "🟢 Easy" "$README" | grep -c "✅")
medium_count=$(grep "🟡 Medium" "$README" | grep -c "✅")
hard_count=$(grep "🔴 Hard" "$README" | grep -c "✅")

sed -i '' -E "s/\* 🟢 Easy: .*/\* 🟢 Easy: $easy_count/" "$README"
sed -i '' -E "s/\* 🟡 Medium: .*/\* 🟡 Medium: $medium_count/" "$README"
sed -i '' -E "s/\* 🔴 Hard: .*/\* 🔴 Hard: $hard_count/" "$README"

echo "Summary updated: Easy=$easy_count, Medium=$medium_count, Hard=$hard_count"
