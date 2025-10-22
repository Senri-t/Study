/* ■ [回答]と記載のある箇所へ、1〜8の各課題内容に沿ったSQL文を記述しなさい。 */

-- 1. Staffテーブルから「経理部」に所属する社員の情報をすべて抽出してください。

SELECT * from staff WHERE section = '経理部';

-- 2. 在庫(Stocksテーブル)の在庫数(Quantity)が10以上25未満のものを抽出して下さい。

SELECT * FROM Stocks
WHERE Quantity BETWEEN 10 AND 25;

-- 3. INTERSECT演算子を使用して、Order_Headerテーブルで合計値(Total)が5000以上10000未満のものを抽出して下さい。
SELECT * FROM Order_Header WHERE Total > 5000
INTERSECT
SELECT * FROM Order_Header WHERE Total < 6000;

-- 4. 「関東」エリアの全店舗情報を抽出して下さい。
SELECT * from shop WHERE areacode = '04';

-- 5. 在庫(Stocksテーブル)内の各商品の合計数量を抽出して下さい。
SELECT quantity from stocks;

-- 6. 商品（Gods）テーブルから単価（UnitPrice)が5000円より高い商品の情報を全て抽出して下さい。
SELECT * FROM goods WHERE unitPrice > 5000;

-- 7. Shopテーブルの全ての店舗コード（Shopcode）、店舗名（Shopname）を、所在地（areaname）とあわせて抽出してください。
SELECT Shopcode,Shopname,areaname FROM shop
JOIN area ON shop.areacode = area.areacode;

-- 8. 「新宿」店の在庫数が10以上の商品の商品コード（GoodsCode）、商品名（GoodsName）、在庫数（quantity）を抽出して下さい。
SELECT goods.goodscode,goodsname,quantity FROM goods
JOIN stocks ON goods.goodscode = stocks.goodscode
WHERE shopcode = '001' AND quantity > 10;

