local materialYouColors = require('plugin.materialYouColors')
local widget = require('widget')
local json = require('json')



local _W, _H = display.actualContentWidth, display.actualContentHeight
local _CX = display.contentCenterX

local width = _W * 0.8
local size = _H * 0.1
local buttonFontSize = 16

local y = size * 0.5
local spacing = _H * 0.12

local color1_3 = display.newRect( _CX-100, display.contentCenterY, 50, 50 )
local color1_4 = display.newRect( _CX-50, display.contentCenterY, 50, 50 )
local color1_5 = display.newRect( _CX, display.contentCenterY, 50, 50 )
local color1_6 = display.newRect( _CX+50, display.contentCenterY, 50, 50 )
local color1_7 = display.newRect( _CX+100, display.contentCenterY, 50, 50 )

local color2_3 = display.newRect( _CX-100, display.contentCenterY+50, 50, 50 )
local color2_4 = display.newRect( _CX-50, display.contentCenterY+50, 50, 50 )
local color2_5 = display.newRect( _CX, display.contentCenterY+50, 50, 50 )
local color2_6 = display.newRect( _CX+50, display.contentCenterY+50, 50, 50 )
local color2_7 = display.newRect( _CX+100, display.contentCenterY+50, 50, 50 )

local color3_3 = display.newRect( _CX-100, display.contentCenterY+100, 50, 50 )
local color3_4 = display.newRect( _CX-50, display.contentCenterY+100, 50, 50 )
local color3_5 = display.newRect( _CX, display.contentCenterY+100, 50, 50 )
local color3_6 = display.newRect( _CX+50, display.contentCenterY+100, 50, 50 )
local color3_7 = display.newRect( _CX+100, display.contentCenterY+100, 50, 50 )

local color4_3 = display.newRect( _CX-100, display.contentCenterY+150, 50, 50 )
local color4_4 = display.newRect( _CX-50, display.contentCenterY+150, 50, 50 )
local color4_5 = display.newRect( _CX, display.contentCenterY+150, 50, 50 )
local color4_6 = display.newRect( _CX+50, display.contentCenterY+150, 50, 50 )
local color4_7 = display.newRect( _CX+100, display.contentCenterY+150, 50, 50 )

local color5_3 = display.newRect( _CX-100, display.contentCenterY+200, 50, 50 )
local color5_4 = display.newRect( _CX-50, display.contentCenterY+200, 50, 50 )
local color5_5 = display.newRect( _CX, display.contentCenterY+200, 50, 50 )
local color5_6 = display.newRect( _CX+50, display.contentCenterY+200, 50, 50 )
local color5_7 = display.newRect( _CX+100, display.contentCenterY+200, 50, 50 )

widget.newButton{
	x = _CX, y = display.contentCenterY-100,
	width = width, height = size,
	label = 'Get Main Colors',
	fontSize = buttonFontSize,
	onRelease = function()
		local myColors = materialYouColors.getColors()
		if(myColors)then
			print(json.encode( myColors ))
			color1_3:setFillColor(myColors[1][3][1], myColors[1][3][2], myColors[1][3][3])
			color1_4:setFillColor(myColors[1][4][1], myColors[1][4][2], myColors[1][4][3])
			color1_5:setFillColor(myColors[1][5][1], myColors[1][5][2], myColors[1][5][3])
			color1_6:setFillColor(myColors[1][6][1], myColors[1][6][2], myColors[1][6][3])
			color1_7:setFillColor(myColors[1][7][1], myColors[1][7][2], myColors[1][7][3])

			color2_3:setFillColor(myColors[2][3][1], myColors[2][3][2], myColors[2][3][3])
			color2_4:setFillColor(myColors[2][4][1], myColors[2][4][2], myColors[2][4][3])
			color2_5:setFillColor(myColors[2][5][1], myColors[2][5][2], myColors[2][5][3])
			color2_6:setFillColor(myColors[2][6][1], myColors[2][6][2], myColors[2][6][3])
			color2_7:setFillColor(myColors[2][7][1], myColors[2][7][2], myColors[2][7][3])

			color3_3:setFillColor(myColors[3][3][1], myColors[3][3][2], myColors[3][3][3])
			color3_4:setFillColor(myColors[3][4][1], myColors[3][4][2], myColors[3][4][3])
			color3_5:setFillColor(myColors[3][5][1], myColors[3][5][2], myColors[3][5][3])
			color3_6:setFillColor(myColors[3][6][1], myColors[3][6][2], myColors[3][6][3])
			color3_7:setFillColor(myColors[3][7][1], myColors[3][7][2], myColors[3][7][3])

			color4_3:setFillColor(myColors[4][3][1], myColors[4][3][2], myColors[4][3][3])
			color4_4:setFillColor(myColors[4][4][1], myColors[4][4][2], myColors[4][4][3])
			color4_5:setFillColor(myColors[4][5][1], myColors[4][5][2], myColors[4][5][3])
			color4_6:setFillColor(myColors[4][6][1], myColors[4][6][2], myColors[4][6][3])
			color4_7:setFillColor(myColors[4][7][1], myColors[4][7][2], myColors[4][7][3])

			color5_3:setFillColor(myColors[5][3][1], myColors[5][3][2], myColors[5][3][3])
			color5_4:setFillColor(myColors[5][4][1], myColors[5][4][2], myColors[5][4][3])
			color5_5:setFillColor(myColors[5][5][1], myColors[5][5][2], myColors[5][5][3])
			color5_6:setFillColor(myColors[5][6][1], myColors[5][6][2], myColors[5][6][3])
			color5_7:setFillColor(myColors[5][7][1], myColors[5][7][2], myColors[5][7][3])
		else
			print("Not Supported")
		end

	end
}
