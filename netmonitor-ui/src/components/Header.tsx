import React from "react"
import { Box, Flex, Text } from "@chakra-ui/react"

// -----------------------------------------------------------
// Header component
// -----------------------------------------------------------
export default function Header() {
  return (
    <Box
      bg="linear-gradient(
        135deg, 
        #080d1f 0%, 
        #102B5C 50%,
        #081329 100%)"
      height="100px"
      width="calc(100% - 240px)"
      marginLeft="240px"
    >
      <Flex
        align="center"
        gap={2}
        px={4}
        py={2}
      >
        <Text
          fontSize="xl"
          fontWeight="bold"
          color="white"
          letterSpacing="1px"
        >
        </Text>
      </Flex>
    </Box>
  )
}