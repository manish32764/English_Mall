# mall function completion progress

## Frame Building

Features | Done
----|----
Integrated MyBatis | ✔
Integrated MyBatisGenerator | ✔
Integrated SpringSecurity | ✔
Integrated Swagger-UI | ✔
Integrated Hibernator-Validator | ✔
Integrated Log | ✔
Integrated Monitoring | ✔
crud operation demo | ✔
Rational planning package structure | ✔
SpringAOP Universal Log Processing | ✔
SpringAOP Universal Validation Failure Result Return | ✔
CommonResult encapsulates generic return results | ✔
SpringSecurity Login to Restful | ✔
JWT Login, Sign Up, Get tokens | ✔
JTA Transaction Handling | ✔
Integration Unit Testing | ✔
OSS Upload Feature | ✔
Elasticsearch search function | ✔
HTTPS support | ✔
Redis Digital ID Generation | ✔
SpringTask Timing Task Support | ✔
docker containerized deployment | ✔
Configurations distinguish between production and test environments | ✔
ELK log collection function | ✔
RabbitMq Asynchronous Communication | ✔
RestTemplate inter-service call | ✔
SpringSecurity Rights Management Features | ✔
Integrated SpringCloud |

## Background Features

### Background Login Feature

- Background user registration function
- Obtain token after login
- Refresh token function

### Product Management

> **Product Category Manageageing**

- View a list of categories by parent category number
- Add, edit, delete categories
- Transfer Category Items

> **Product Brand Manageing**

- List of brands by brand name search tab
- Add, edit, delete brands
- View all products of the current brand

> **Product attribute category manage**

- Add product attribute category (name)
- Check all product attribute categories by page
- Delete a single product attribute category
- Modify a single attribute classification name
- Querys individual attribute classification information

> **Product Property Manageageing**

- Querate attribute list or parameter list based on category (pagination, support type)
- Add product attributes
- Querate individual product attributes
- Edit product attributes
- Delete product attributes in bulk
- Search all product attributes by page

> **Add items**

- Select product category: Find category by product category id
- Select a brand: Check all brands
- Select a shipping template: query all shipping templates
- Set membership price: check all membership levels, pass in List<PmsMemberPrice>
- Add ladder price: parameter to pass in List<PmsProductLadder>
- Set Full Price Reduction: Parameter Incoming List<PmsProductFullReduction>
- Select product attribute category: Get all product attribute categories, get specifications and parameters based on the id of the product attribute category (type=0-> specifications; type=1-> parameters)
- Select specifications and generate inventory information: front-end implementation
- Add sku inventory information: parameters pass in List<PmsSkuStock>
- Set properties picture: set to pic and album_pics fields to go
- Add Product Parameter: Parameter pass in List<PmsProductAttributeValue>
- Add Custom Product Specifications: Parameter Incoming List<PmsProductAttributeValue>
- Related topic: parameter pass in list<CmsSubjectProductRelation>relationship
- association preference: parameter pass in list<CmsPrefrenceAreaProductRelation>relationship

> **Modify items**

- Look up product information based on product id
- Find basic product information: Product Category Name, Brand Name, Shipping Template Name
- Search product promotion information: member price, ladder price, full discount price
- Look up product attribute information: product attribute category name, sku inventory information, attribute category corresponding specifications and parameter values
- Look up product association information: Product association topics and association preferences
- Modification of product information: Product attribute category and specification cannot be modified, only support single sku modification, deletion, addition; Product attribute category and specification can be modified: display original sku inventory after modification and attribute classification

> **Product page**

- Status of the product: All products, listed, unlisted, pending review, unpassed (publishStatus verifyStatus)
- Product Name (%name%)
- Item number (productSn)
- Product Category ID (productCategoryId)
- Product brand id (brandId)
- Bulk operations: listing, referrals, new products, transfer sorting, placement in recycle bins, review
- View records: audit records, operation logs
- sku: Get sku information based on product and sku number, modify sku information in bulk

> **Product Recycling Manage**

- List of recycled items displayed in tabbed
- Recycled goods restore function

#### Promotion Management

> **Lightning Event Manageageing**

- Event List Display
- Events up and down.
- Set up active items
- Add, edit, delete activities

> **Coupon Manage**

- Coupon list display
- Add, edit, delete coupons
- View coupon redemption history

> **Event Manageing**

- Event List Display
- Add, edit, delete activities
- Events up and down.
- posted to ads

> **Home Page Recommended**

- Brand recommendation: list display, recommendation, sort, delete, multi-select add brand
- Fresh and good things: product list display, recommended, sorted, deleted, multi-select products
- Popular recommendations: product list display, whether to recommend, sort, delete, multi-select to add products
- Featured: Thematic list display, whether to recommend, sort, delete, multi-select to join the Thematic
- Ad management: Ad list display, whether to go online, sort, delete, add editorial ads

### Content Management

> **Thematic Manageing**

- List of topics: View, delete, recommend topics
- Add & Edit Topic: Select Theme Category, Add & Remove Associated Products
- Thematic category management: control display, sort, edit and delete categories

> **Choice Themes**

- Preferences list: control display, sort, delete
- Add and Edit Preferences: Linking and Removing Products

> **Themes Manageing**

- List of topics: View, delete, hot topics
- Topic management: control display, sort, edit and delete categories

> **Help Manageing**

- Help list: View, delete, control display
- Add & Edit Help: Select Help Category
- Help with category management: control display, sort, edit and delete categories

### User Management

> **User Manageing**

- User list: account activation, deletion, mass SMS
- Bulk operation: SMS, SMS, Push, Label, Free Coupon
- View and edit user information: user details (statistics, shipping address, order record), edit profile, login log
- Purchase power selection: recent purchases, number of purchases, amount spent, average order price, product category, membership level, user tag
- User tag management: tag list, add, edit, delete
- Member level settings: list, add, edit, set default membership level

> **Talent Value and Points**

- Growth value and integral query: list display, integral details, growth value details, modified values
- Quest reward settings: Novice Quest, Daily Quest
- More rules: growth rules, points rules, points spending settings

### order management

> **Orders List**

- Search for orders: order number, consignee name/number, order status, order category, order source, submission time
- order actions: view orders, close orders, ship orders, track orders, delete orders
- Bulk operations: bulk shipment, close order, delete order

> **View Orders

- Status of order: Submit order, pay order, issue platform, confirm receipt, complete evaluation
- order details actions: modify invoice information, modify consignee information, modify product information, modify fee information, send in-station letter, close order, note order, cancel order, order tracking, delete order
- Basic order information: order information, discount information, user information
- Invoice Information: Type, Header, Content, Receiver Information
- Consignee information: consignee, mobile phone number, postal code, shipping address
- Product information: Includes basic product information
- Fee information: total and discount information
- Operation information: Change of order status

> **Orders Settings**

- Lightning order timeout
- Normal order timeout
- Automatic completion time of order
- Automatic closing time
- Automatic positive time

> **Return Request Handling

- Return request search: service slip number, consignee name/number, processing status, request time, operator, processing time
- Bulk operations: Delete
- View details: returned goods, service order information, return confirmation, return rejection, receipt confirmation

> **Return Reason Settings**

- List of reasons: type, sort, whether enabled, add time
- Reason for adding and editing: Same as above
- Bulk operations: Delete

### Rights Management

> **Rights Manageing**

- Permissions management: Add permissions, delete permissions, modify permissions, return permissions in tree structure
- Role management: Add roles, delete roles, update roles, list of roles, obtain permissions for roles, modify permissions for roles
- Member management: Add, edit, delete members, member lists, assign roles to members, get member roles, assign +- permissions, get permission lists

Character | Menu
----|----
Admin | All Menu Permissions
Operations | Home page, users, promotions, operations, content
Finance | Home、Statistics、Finance
Artis|Home, Products
Customer Service | Home, Products, Orders

## Front Desk Features

### Product Search

> **Comprehensive search functions**

- Search: Search by product title, subtitle, keyword;
- Select: aggregate search results when no category is selected, select the category that appears most often. Select the category after selecting the category can be selected according to the selection field;
- Sort: Sort by New, Sales, Price
- Search results: Product ID, product image, title, subtitle, price, product sales, new product, product parameters, brand name, category name
- Interface: query related data from the database and import es, insert (modify) data interface, delete data interface
- Brand category selection: returns brands, categories and attributes based on search results aggregation

> **Product Recommended Features**

- Recommend products related to a product, based on the product's brand (10), category (6), name (8), keyword (2), subtitle (2)
- Recommended items based on user's browsing history, recommended items based on user search history

> **Product Hot Search Features**

- Generate hot search terms based on aggregation of user search records

> **Product Search Lenovo features**

- Generate hot search terms based on aggregation of user search records

### Shopping Process

> **Shopping Cart

- Add items to cart
- Shopping Cart product list (main image, title, number of items, product specifications)
- Modify the number of items in your shopping cart
- Shopping Cart Product Re-selection Specifications
- Item deletion function in shopping cart

>**Generate Confirm**

- Generate confirmation information: receipt information, commodity information, price information, invoice information, payment method
- Select Ship To Address: Default Ship To Address
- Select Coupons and Credits: Show Available Coupons and No Coupons
- Calculate product price: item total, shipping cost, coupon discount, points discount, event discount
- Select payment method: online payment and cash on delivery
- Calculate the amount payable: total+shipping - Coupon rebate - Points rebate - Event offers

> **Submit an ORG**

- Transform confirmation information into an order
- Delete related items in your shopping cart
- Add orders to database and lock inventory
- Online payment options: Alipay, WeChat, UnionPay, ApplePay

> **Pay for an ORD**

- After payment is completed, change the order status to paid, deduction of inventory

> **Cancel order (in case of non-payment) **

- Automatically cancel the order after the order times out, unlock the product inventory, return coupons, points

#### Member Module (mine)

> **My Concern**

- List of brands of interest: brand logo, name, address, number of attention
- Unfollow feature
- Watch List Display

> **My Collection**

- Favorite items: main product image, title, selling point, price, similar
- Collection of topics: theme, title, subtitle, favorites, views, comments
- Topic Topic: Topic, Title, Subtitle, Favorites, View, Comments

> **My Footprint

- Items you've looked at: Main product image, title, selling point, price, similar
- Delete Logging Function
- View list display

> **Member Login Registration**

- Login function: https login
- Registration function: username, password, mobile phone number, mobile phone verification code
- Get verification code: background generation verification code, verification code binding mobile phone number
- Forgot password: mobile phone number, SMS verification code, new password
- Logout function
